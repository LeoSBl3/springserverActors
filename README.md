##Checklista: Funktionalitet för Godkänt
#Planering:
- [x] Du ska i serverkomponenten ha en fil som heter README.md där du
  listar minst 10 punkter med saker du behöver göra. Beskrivningarna
  kan vara korta men ska vara tydliga. Det ska tydligt gå att utläsa
  huruvida den punkten är avklarad eller inte.

- 
  #Serverkomponenten:
- [x] Create Spring project in IntelliJ and add README.md
  - IntelliJ > New > Project > select Spring Intializer > fill the project name and package name com.example.[projectname]>
  select jdk highest version > clicK next> click finish 
  - Right click on project name > new > file > name it README.md
- [X] Servern ska använda sig av Spring-ramverket och det är i servern som alla
  blogginlägg sparas
- [X] Servern ska svara på API-förfrågningar för att lista inlägg, redigera inlägg, ta bort
  inlägg och visa specifikt inlägg.
- [x] Adresserna till dessa API-förfrågningar ska vara följande:
- [x] /api/v1/blog/list – Lista alla inlägg
- [x] /api/v1/blog/view/<id> - Visa ett specifikt inlägg
- [x] /api/v1/blog/update/<id> - Visa ett specifikt inlägg
- [x] /api/v1/blog/delete/<id> - Ta bort ett specifikt inlägg
- [x] /api/v1/blog/clear/ - Ta bort alla inlägg
- [x] /api/v1/blog/create – Lägg till ett nytt inlägg
- [x] Fler får läggas till om du känner ett behov av det : Det behov inte
- [x] Varje förfrågan måste använda en lämplig HTTP-metod (GET, POST, PATCH et
  cetera)
- [] Din kod ska sparas i versionhantering med Git



