
#### Database name is animals_api

## GET /animals/all
## http://localhost:8080/animals/all
## Response

'''
{
        "animalID": 1,
        "name": "Blue Jay",
        "scientificName": "Cyanocitta cristata",
        "species": "Bird",
        "habitat": "Forest",
        "description": "A vibrant bird with blue feathers."
    },
    {
        "animalID": 5,
        "name": "Golden Poison Frog",
        "scientificName": "Phyllobates terribilis",
        "species": "Amphibian",
        "habitat": "forest",
        "description": "A small, bright yellow frog, considered one of the most toxic animals on Earth."
    }
    '''
    
'GET /animals/{animalId}'
'http://localhost:8080/animals/5'
Response
  '''{
      "animalID": 5,
      "name": "Golden Poison Frog",
      "scientificName": "Phyllobates terribilis",
      "species": "Amphibian",
      "habitat": "forest",
      "description": "A small, bright yellow frog, considered one of the most toxic animals on Earth."
  }'''
'POST /animals/new'
'http://localhost:8080/animals/new'
Response
'''{
        "animalID": 15,
        "name": "Emperor Penguin",
        "scientificName": "Aptenodytes forsteri",
        "species": "Bird",
        "habitat": "Antarctic",
        "description": "The tallest and heaviest of all penguins, native to Antarctica."
}'''

'PUT /animals/update/{animalId}'
'http://localhost:8080/animals/update/1'
Response
'''{
        "animalID": 1,
        "name": "Blue Jay",
        "scientificName": "Cyanocitta cristata",
        "species": "Bird",
        "habitat": "Forest",
        "description": "A vibrant bird with blue feathers."
    }'''
'Delete /animals/delete/{animalId}'
'http://localhost:8080/animals/delete/1'
Response
'''{
        "animalID": 5,
        "name": "Golden Poison Frog",
        "scientificName": "Phyllobates terribilis",
        "species": "Amphibian",
        "habitat": "forest",
        "description": "A small, bright yellow frog, considered one of the most toxic animals on Earth."
},
{
        "animalID": 15,
        "name": "Emperor Penguin",
        "scientificName": "Aptenodytes forsteri",
        "species": "Bird",
        "habitat": "Antarctic",
        "description": "The tallest and heaviest of all penguins, native to Antarctica."
}'''

'GET /animals/species/{species}'
'http://localhost:8080/animals/species/Amphibian'
Response
'''{
        "animalID": 5,
        "name": "Golden Poison Frog",
        "scientificName": "Phyllobates terribilis",
        "species": "Amphibian",
        "habitat": "forest",
        "description": "A small, bright yellow frog, considered one of the most toxic animals on Earth."
}'''

'GET /animals/search'
'http://localhost:8080/animals/search?name=Golden'

'''{
        "animalID": 5,
        "name": "Golden Poison Frog",
        "scientificName": "Phyllobates terribilis",
        "species": "Amphibian",
        "habitat": "forest",
        "description": "A small, bright yellow frog, considered one of the most toxic animals on Earth."
}'''






