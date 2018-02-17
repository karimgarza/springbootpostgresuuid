# springbootpostgresuuid
An example of how to use Spring Boot with Postgres and id that use optional UUIDs for entities. If you supply an UUID to the entity, then it will use that UUID to create a new Person in the database. If you do not supply a UUID when creating and saving a new Person, then the persistance layer will generate one for you.
