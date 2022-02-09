package com.example.springserver;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "api/v1/blog")
public class ActorsController {

    //Create array list
    ArrayList<Actors> myActors;

    int Id;

    public ActorsController() {
        myActors = new ArrayList<Actors>();
        Id = 0;
    }


    @RequestMapping(value = "create", method = RequestMethod.POST)
    public Actors addActor(@RequestBody Actors actors) {
        Id++;
        actors.setId(Id);
        myActors.add(actors);
        System.out.println("adding actor Id =  " + Id);
        return actors;
    }

    @RequestMapping(value = "update/{id}", method = RequestMethod.POST)
    public Actors updateActor(@PathVariable("id") int id, @RequestBody Actors actorsChanges) {
        Actors actorsToUpdate = new Actors();
        if(myActors.isEmpty()){
            System.out.println("The list is empty");
        }else{
            System.out.println("Getting actor with id " + id);
            int actorIndex = getActorIndex(id);
            if(actorIndex>-1) {
                actorsToUpdate = myActors.get(actorIndex);
                if (actorsChanges.getName() != null) {
                    actorsToUpdate.setName(actorsChanges.getName());
                }
                if (actorsChanges.getAge() != 0) {
                    actorsToUpdate.setAge(actorsChanges.getAge());
                }
                System.out.printf("The actor with Id %d is updated successfully \n", id);
            } else {
                System.out.println("Actor not found");

            }
        }


        return actorsToUpdate;

    }

    @RequestMapping(value = "view/{id}", method = RequestMethod.GET)
    public Actors getActorbyId(@PathVariable("id") int id) {

        Actors actorsToDisplay = new Actors();
        if(myActors.isEmpty()){
            System.out.println("The list is empty");
        }else{
            System.out.println("Getting actor with id " + id);
            int actorIndex = getActorIndex(id);
            if(actorIndex>-1){
                actorsToDisplay = myActors.get(actorIndex);
            }else {
                System.out.println("Actor not found");
            }

        }

        return actorsToDisplay;
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteActor(@PathVariable("id") int id) {

        if(myActors.isEmpty()){
            System.out.println("The list is empty");
        }else{
            int actorIndex = getActorIndex(id);
            if(actorIndex>-1) {
                myActors.remove(actorIndex);
                System.out.printf("The actor with Id %d is deleted successfully\n", id);
            } else {
                System.out.println("Actor id not found");

            }
        }

    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ArrayList<Actors> listAllActors() {
        System.out.println("listing all actors ");
        return myActors;
    }


    @RequestMapping(value = "clear", method = RequestMethod.DELETE)
    public void deleteAllActors() {
        myActors.clear();
        System.out.println("The list is deleted successfully");
    }


    private int getActorIndex(int id) {
        int i ;
        boolean actorFound = false;

        for (i = 0; i < myActors.size(); i++) {
            Actors currentActors = myActors.get(i);
            if (currentActors.getId() == id) {

                actorFound = true;
                break;
            }
        }
        if(!actorFound) {
            i = -1;
        }
        return i;
    }


}