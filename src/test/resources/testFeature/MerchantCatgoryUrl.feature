@SH-59
Feature: Validate merchant category on shoop

  Scenario Outline: Merchant category tabs urls

    When I click on a merchant"<merchantTable>"category name
    Then I should see merchant category tabs displayed
   ## Then I should see merchant category "<CategoryName>"tabs displayed

    Examples:
      | merchantTable            |
      | femme-enceinte           |
      | bebe                     |
      | sacs-bagages             |
      | lunettes-de-soleil       |
      | montres-bijoux           |
      | chaussures               |
      | enfant                   |
      | maison-jardin            |
      | Voyages                  |
      | high-tech-electromenager |
      | mobile-telephone-tv      |
      | Divertissement           |
      | rencontre-sur-internet   |
      | photo-numerique-tirages  |
      | consoles-jeux-video      |
      | deguisements             |
      | billetterie-concerts     |
      | charme-adulte            |
      | musique-streaming        |
      | bio-produits-naturels    |
      | puericulture             |
      | minceur                  |
      | maquillage-cosmetiques   |
      | parapharmacie            |
      | nutrition-sportive       |
      | lunettes-lentilles       |
      | offres-internet          |
      | forfaits-mobile          |
      | camescope-photo          |
      | electromenager           |
      | gadgets-electroniques    |
      | image-son                |
      | informatique             |
      | logiciels                |
      | parcs-de-loisirs         |
      | ski-sports-d-hiver       |
      | thalasso                 |
      | courts-sejours           |
      | croisieres               |
      | location-de-voiture      |
      | train                    |
      | bricolage                |
      | jardin                   |
      | cuisine                  |
      | meubles                  |
      | animalerie               |
      | gaz-electricite          |
      | services-a-domicile      |
      | homme                    |
      | femme                    |
      | lingerie                 |
      | vetements-d-occasion     |
      | literie-linge-de-maison  |
      | sejours-location         |
      | hotels                   |
      | billets-d-avion          |
      | parfums                  |
      | films-series             |
      | livres-magazines         |

#      | merchantTable              | CategoryName                                                                                                                                   |
#      | femme-enceinte             | Femme-enceinte                                                                                                                                 |
#      | bebe                       | Bebe                                                                                                                                           |
#      | sacs-bagages               | Sacs-bagages                                                                                                                                   |
#      | lunettes-de-soleil         | Lunettes de soleil                                                                                                                             |
#      | montres-bijoux             | services-a-domicile
#      | chaussures,enfant          | gaz-electricite                                                                                                                                |
#      | Maison & Jardin            | services-a-domicile,gaz-electricite,animalerie,meubles,cuisine,jardin,bricolage                                                                |
#      | Voyages                    | Parcs de loisirs,Ski & Sports d'hiver,Thalasso,Courts séjours,Croisières,Location de voiture,Train                                             |
#      | High-Tech & Électroménager | Caméscope & Photo,Électroménager,Gadgets électroniques,Image & Son,Informatique,Logiciels                                                      |
#      | Mobile, Internet & TV      | Offres Internet,Forfaits mobile                                                                                                                |
#      | Beauté & Santé             | Bio & produits naturels,Puériculture,Minceur,Maquillage & cosmétiques,Parapharmacie,Nutrition sportive,Lunettes & lentilles                    |
#      | Divertissement             | Rencontre sur Internet,Photo numérique & tirages,Consoles & Jeux vidéo,Déguisements,Billetterie & Concerts,Charme & Adulte,Musique & Streaming |
