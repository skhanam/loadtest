@ignore
Feature: NOt logged user Merchant category search on shoop

  Scenario Outline: Merchant category search
    Given I go to shoop home Page
    When I click on merchant"<merchantTable>"category name
    Then I should see a category "<CategoryName>"of merchant

    Examples:
      | merchantTable              | CategoryName                                                                                                                                   |
      | Mode                       | femme-enceinte,bebe,sacs-bagages,lunettes-de-soleil,montres-bijoux,chaussures,enfant                                                           |
      | Maison & Jardin            | services-a-domicile,gaz-electricite,animalerie,meubles,cuisine,jardin,bricolage                                                                |
      | Voyages                    | Parcs de loisirs,Ski & Sports d'hiver,Thalasso,Courts séjours,Croisières,Location de voiture,Train                                             |
      | High-Tech & Électroménager | Caméscope & Photo,Électroménager,Gadgets électroniques,Image & Son,Informatique,Logiciels                                                      |
      | Mobile, Internet & TV      | Offres Internet,Forfaits mobile                                                                                                                |
      | beaute-sante               | Bio & produits naturels,Puériculture,Minceur,Maquillage & cosmétiques,Parapharmacie,Nutrition sportive,Lunettes & lentilles                    |
      | Divertissement             | Rencontre sur Internet,Photo numérique & tirages,Consoles & Jeux vidéo,Déguisements,Billetterie & Concerts,Charme & Adulte,Musique & Streaming |

