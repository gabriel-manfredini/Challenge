# Challenge
Reclame Aqui restful API challenge
Desenvolvido utilizando SpringBoot, MongoDB, Java8 e SpringSecurity

Requisitos:
Maven instalado e no Path de seu SO
Git instalado e no Path 

Execucao:

Clone o repositorio ( git clone https://github.com/gabriel-manfredini/Challenge.git)
utilize o maven e spring para realizar o build e o start da aplicacao ( mvn spring-boot:run).

APIS disponiveis (Testadas utilizando POSTMAN)
GET  http://localhost:8080/api/complain - lista todas reclamacoes
GET  http://localhost:8080/api/complain/{id} - busca uma reclamacao pelo ID
GET  http://localhost:8080/api/complain/loc/{locale} - busca reclamacoes por localidade
GET  http://localhost:8080/api/complain/cp/{company} - busca reclamacoes por empresa
GET  http://localhost:8080/api/complain/loc&cp/{locale}&{company} - busca reclamacoes por empresa e localidade
POST http://localhost:8080/api/complain - cadastra nova reclamacao
PUT http://localhost:8080/api/complain/id - atualiza reclamacao
DELETE http://localhost:8080/api/complain/id - deleta reclamao pelo ID 
