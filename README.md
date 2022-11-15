# Talent-Sourcing-System-Backend

This is server side for Talent-Sourcing-System. Used MySql for backend and JavaSpring for server side.

There is the table names and columns. There is OnetoMany Relationship between Candidate and Candidate Intereactions.
![image](https://user-images.githubusercontent.com/49747165/201910057-d8286731-720a-4cd6-b29a-31f55fcaefe7.png)


# Request
Auth will be required to access this end point.

main directory: /api/v1/

| REQUEST TYPE | Endpoint | Type |Description |
| :---         |     :---:      |    :---: |         ---: |
| GET   | /candidates    | JSON Object List   | Get all candidates registered in the system|
| GET     |/candidates/{id}       | JSON Object(Single)     | Get a specific candidate information
| GET   | /interactions?candidateId={id}    | JSON Object List    | Get all interactions about specified candidate  |
| GET   | /interactions/{interactionsId}    | JSON Object(single)    | Get a spesific interactions  |
| POST   |/candidates    | JSON Object    | Insert a new candidate |
| POST   | /interactions   | JSON Object    |  Insert a new candidate interaction  |
| PUT   | /candidates/{id}   | JSON Object    | Update a candidate  |
| PUT   | /interactions/{interactionsId}    | JSON Object    | Update a candidatec interactions  |
| DELETE   | /candidates/{id}     | JSON Object    | Delete a candidate  |
| DELETE   | interactions/{interactionsId}    | JSON Object    | Delete a interactions  |






