<h2 align="center"><💻 Event Driven Architecture CQRS and Event Sourcing 💻/></h2>
<h5>- Architecture</h5>
<img src="./Images/Screenshot_1.png" alt="Architecture a implémenter" width="700" style="border: 2px solid black;"/>
<h5>- Dependencies</h5>
<table>
    <tr>
        <td><a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web">Spring Web</a></td>
        <td><a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa">Spring Data JPA</a></td>
        <td><a href="https://mvnrepository.com/artifact/org.axonframework/axon-spring-boot-starter">Axon Spring Boot Starter</a></td>
        <td><a href="https://mvnrepository.com/artifact/mysql/mysql-connector-java">MySQL Driver</a></td>   
    </tr>
</table>
<details>
    <summary>📝 Partie 1 - Ecriture <a href="https://github.com/ElyousfiMohamed/Event-Driven-Architecture-CQRS-and-Event-Sourcing/tree/master/compte-cqrs-es/src/main/java/com/example/comptecqrses" target="_blank">[Code Source]</a></summary>
    <p>
        <h4>Creation des commandes (CommonApi)</h4>
        <h5>- BaseCommand</h5>
        <img src="./Images/Screenshot_3.png" alt="Screenshot_3.png" width="700" style="border: 2px solid black;"/>
        <h5>- CreateAccountCommand</h5>
        <img src="./Images/Screenshot_4.png" alt="Screenshot_4.png" width="700" style="border: 2px solid black;"/>
        <h5>- CreditAccountCommand</h5>
        <img src="./Images/Screenshot_5.png" alt="Screenshot_5.png" width="700" style="border: 2px solid black;"/>
        <h5>- DebitAccountCommand</h5>
        <img src="./Images/Screenshot_6.png" alt="Screenshot_6.png" width="700" style="border: 2px solid black;"/>
        <h5>- Controller CreateAccountCommand (Commands)</h5>
        <img src="./Images/Screenshot_8.png" alt="Screenshot_7.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_7.png" alt="Screenshot_8.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_10.png" alt="Screenshot_10.png" width="700" style="border: 2px solid black;"/>
        <h5>- Base de données (PhpMyAdmin)</h5>
        <img src="./Images/Screenshot_9.png" alt="Screenshot_9.png" width="700" style="border: 2px solid black;"/>
        <h4>Creation des événements (CommonApi)</h4>
        <h5>- BaseEvent</h5>
        <img src="./Images/Screenshot_12.png" alt="Screenshot_12.png" width="700" style="border: 2px solid black;"/>
        <h5>- AccountCreatedEvent</h5>
        <img src="./Images/Screenshot_13.png" alt="Screenshot_13.png" width="700" style="border: 2px solid black;"/>
        <h5>- Creation de l'agrégat (AccountAggregate)</h5>
        <img src="./Images/Screenshot_14.png" alt="Screenshot_11.png" width="700" style="border: 2px solid black;"/>
        <h5>- CommandHandler</h5>
        <img src="./Images/Screenshot_15.png" alt="Screenshot_15.png" width="700" style="border: 2px solid black;"/>
        <h5>- EventSourcingHandler</h5>
        <img src="./Images/Screenshot_16.png" alt="Screenshot_16.png" width="700" style="border: 2px solid black;"/>
        <h5>- Test (Postman)</h5>
        <img src="./Images/Screenshot_17.png" alt="Screenshot_17.png" width="700" style="border: 2px solid black;"/>
        <h5>- EventStore</h5>
        <img src="./Images/Screenshot_18.png" alt="Screenshot_18.png" width="700" style="border: 2px solid black;"/>    
        <h5>- EventStore (Controller)</h5>
        <img src="./Images/Screenshot_20.png" alt="Screenshot_20.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_21.png" alt="Screenshot_19.png" width="700" style="border: 2px solid black;"/>
        <h5>- AccountActivatedEvent & EventSourcingHandler</h5>
        <img src="./Images/Screenshot_22.png" alt="Screenshot_22.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_23.png" alt="Screenshot_23.png" width="700" style="border: 2px solid black;"/>
        <h5>- Test (Postman)</h5>
        <img src="./Images/Screenshot_24.png" alt="Screenshot_24.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_25.png" alt="Screenshot_25.png" width="700" style="border: 2px solid black;"/>
        <h5>- AccountDebitedEvent</h5>
        <img src="./Images/Screenshot_26.png" alt="Screenshot_26.png" width="700" style="border: 2px solid black;"/>
        <h5>- EventSourcingHandler</h5>
        <img src="./Images/Screenshot_28.png" alt="Screenshot_28.png" width="700" style="border: 2px solid black;"/>
        <h5>- CreditAccount (Controller)</h5>
        <img src="./Images/Screenshot_27.png" alt="Screenshot_27.png" width="700" style="border: 2px solid black;"/>
        <h5>- Test (Postman)</h5>
        <img src="./Images/Screenshot_30.png" alt="Screenshot_29.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_31.png" alt="Screenshot_29.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_32.png" alt="Screenshot_29.png" width="700" style="border: 2px solid black;"/>
        <h5>- AccountDebitedEvent</h5>
        <img src="./Images/Screenshot_33.png" alt="Screenshot_33.png" width="700" style="border: 2px solid black;"/>
        <h5>- CommandHandler & EventSourcingHandler</h5>
        <img src="./Images/Screenshot_34.png" alt="Screenshot_34.png" width="700" style="border: 2px solid black;"/>
        <h5>- DebitAccount (Controller)</h5>
        <img src="./Images/Screenshot_35.png" alt="Screenshot_35.png" width="700" style="border: 2px solid black;"/>
        <h5>- Test (Postman)</h5>
        <img src="./Images/Screenshot_36.png" alt="Screenshot_36.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_37.png" alt="Screenshot_36.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_38.png" alt="Screenshot_36.png" width="700" style="border: 2px solid black;"/>
    </p>
</details>
<details>
    <summary>📝 Partie 2 - Lecture <a href="https://github.com/ElyousfiMohamed/Event-Driven-Architecture-CQRS-and-Event-Sourcing/tree/master/compte-cqrs-es/src/main/java/com/example/comptecqrses">[Code Source]</a></summary>
    <p>
        <h5>- Entity Account</h5>
        <img src="./Images/Screenshot_39.png" alt="Screenshot_39.png" width="700" style="border: 2px solid black;"/>
        <h5>- Entity OperationAccount</h5>
        <img src="./Images/Screenshot_40.png" alt="Screenshot_40.png" width="700" style="border: 2px solid black;"/>
        <h5>- Repository AccountRepository</h5>
        <img src="./Images/Screenshot_41.png" alt="Screenshot_41.png" width="700" style="border: 2px solid black;"/>
        <h5>- Repository OperationAccountRepository</h5>
        <img src="./Images/Screenshot_42.png" alt="Screenshot_42.png" width="700" style="border: 2px solid black;"/>
        <h5>- AccountServiceHandler (AccountCreatedEvent)</h5>
        <img src="./Images/Screenshot_43.png" alt="Screenshot_43.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_44.png" alt="Screenshot_44.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_45.png" alt="Screenshot_45.png" width="700" style="border: 2px solid black;"/>
        <h5>- AccountServiceHandler (AccountActivatedEvent, AccountDebitedEvent, AccountCreditedEvent)</h5>
        <img src="./Images/Screenshot_52.png" alt="Screenshot_52.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_51.png" alt="Screenshot_51.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_50.png" alt="Screenshot_50.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_49.png" alt="Screenshot_49.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_53.png" alt="Screenshot_53.png" width="700" style="border: 2px solid black;"/>
        <h5>- Controlleur pour la lecture(AllAccounts)</h5>
        <img src="./Images/Screenshot_54.png" alt="Screenshot_54.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_55.png" alt="Screenshot_55.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_56.png" alt="Screenshot_56.png" width="700" style="border: 2px solid black;"/>
        <h5>- Controlleur pour la lecture(getAccountById)</h5>
        <img src="./Images/Screenshot_57.png" alt="Screenshot_57.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_58.png" alt="Screenshot_58.png" width="700" style="border: 2px solid black;"/>
        <img src="./Images/Screenshot_59.png" alt="Screenshot_59.png" width="700" style="border: 2px solid black;"/>
    </p>
</details>





    


