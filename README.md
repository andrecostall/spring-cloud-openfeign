# springboot-rest-template

Projeto springboot, consumindo webservice de CEP e IBGE com OpenFeign
Sites consumidos: https://viacep.com.br/, https://api.postmon.com.br e https://servicodados.ibge.gov.br/api/docs

Exemplo de pesquisa por CEP:  
http://127.0.0.1:8080/api/viacep/
```
curl -v  http://127.0.0.1:8080/api/viacep/99999999
```
http://127.0.0.1:8080/api/postmon/
```
curl -v  http://127.0.0.1:8080/api/postmon/99999999
```
Exemplo de pesquisa por CNAE no IBGE:
http://127.0.0.1:8080/api/ibge/cnae/classes
```
curl -v  http://127.0.0.1:8080/api/ibge/cnae/classes
```
http://127.0.0.1:8080/api/ibge/cnae/classes?classeID=01156
```
curl -v  http://127.0.0.1:8080/api/ibge/cnae/classes?classeID=01156
```

### Tecnologias utilizadas:
- Java 17
- Spring Boot 3.0
- Spring Cloud OpenFeign