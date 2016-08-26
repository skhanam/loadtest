
@MerchantUrl

  Feature: Validate merchant category on shoop
  
  Background: I launch shoop home page
      Given I go to shoop home Page
  
  Scenario Outline: Merchant category tabs urls
  
    When I click on a merchant"<merchantTable>"category name
    Then I should see merchant category tabs displayed


    Examples:
      | merchantTable            |
      | bebe                     |
      | Voyages                  |
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
      | deguisements             |
      | billetterie-concerts     |
      | charme-adulte            |
      | musique-streaming        |
      | bio-produits-naturels    |
      | puericulture             |
      | minceur                  |
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
      | films-series             |
      | livres-magazines         |

