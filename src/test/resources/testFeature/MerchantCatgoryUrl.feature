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
      | cuisi                 |
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

