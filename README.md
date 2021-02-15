# Minisocial Springboot version 

### This project is referenced to: [minisocialnetwork](https://github.com/nguyentrinhan-dev/minisocialnetwork).

## Technique
- ### Frontend
    - #### Now
        - Thymeleaf (in writing)
    - #### Future
        - React
- ### Backend
    - Spring boot (in studying)
- ### Database
    - MS SQL Server
- ### Others
    - Liquibase (in researching)
    - Docker (in processing)

## To run project
### Database
Create a database name `MiniSocial` (preferably), I'll use Liquibase to mirrage column and root data.
### Backend
Import project as maven
Add `application-local.properties` to `src/main/resources` to config database.
```
minisocial.database.host=localhost
minisocial.database.name=miniSocialMedia
spring.datasource.username=<Your database name>
spring.datasource.password=<Your database password>
```
### Docker
Writing...