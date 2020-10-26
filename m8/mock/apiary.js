

FORMAT: 1A
HOST: https://polls.apiblueprint.org/

# calculadoraBasica

Realitzará les **operacions** : 
`suma`
`resta`
`multiplicació`
`divisió`;


## Operacions disponibles [/CalculadoraBasica]

## Operació [/CalculadoraBasica/{operator_id}]

 + Parameters
    + operator_id (number)
 
### Operar [GET]


+ Request (application/json)
    
    + Parameters

        + op1: 88
       
        + op2 : 22
        



+ Response 200 (application/json)

        [
            {
                "question": "Operador?",
                "url": "/CalculadoraBasica/operadors",
                "choices": [
                    {
                        "url": "/CalculadoraBasica/1",
                        "choice": "Suma",
                        "resultat": 110
                        
                    }, {
                        "url": "/CalculadoraBasica/2",
                        "choice": "Resta",
                        "resultat": 66
                        
                    }, {
                        "url": "/CalculadoraBasica/3",
                        "choice": "MUltiplicacio",
                        "resultat": 1936
                        
                    }, {
                        "url": "/CalculadoraBasica/4",
                        "choice": "Divisio",
                        "resultat": 4
                        
                    }
                ]
            }
        ]