# Design-Pattern
sample application to demonstrate architectural design pattern
1. MVC
2. MVP
3. MVVM

MVC
* Model — the data layer, responsible for managing the business logic and handling network or database API.
* View — the UI layer — a visualisation of the data from the Model.
* Controller — the logic layer, gets notified of the user’s behavior and updates the Model as needed.

MVP
* Model - this layer is the gateway between domain layer and business logic.
* View more separated from Model. 
* The Presenter is the mediator between Model and View.

Advantages 
* Easier to create unit tests
* Generally there is a one to one mapping between View and Presenter, with the possibility to use multiple Presenters for complex Views
* Listen to user action and model updates
* Updates model and view as well

MVVM
* The View — that informs the ViewModel about the user’s actions
* The ViewModel — exposes streams of data relevant to the View
* The DataModel — abstracts the data source. The ViewModel works with the DataModel to get and save the data.
