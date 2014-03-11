Contenuto:
	Definizione di un DSL (che chiameremo EC-DSL) capace di comprendere statement definiti secondo la logica del formalismo 'Event Calculus'.
	Progetto di Esempio.
	Librerie a Supporto.

EC-DSL: sono esprimibili ECA-rules tramite le seguenti keyword:
	on Evento0 set Fluente0 to 20;
	on Evento1(x,y,z) set 	Fluente1 to 15+x-z 
					if [Fluente0 at 10] < y,
				Fluente 2 to 15 
					if Fluente1 != null AND Fluente0 == null

WHY?
è un tentativo di semplificare la fase di progettazione di applicazioni Android, in favori di utenti meno esperti di quelli che usano i tradizionali linguaggi di tipo GPL. 

HOW?
Occorrono i seguenti tool e, ove necessario, le variabili d'ambiente che puntano al giusto path per ogni tool come indicato dalle rispettive documentazioni:
	Eclipse Kleper
	Xtext Eclipse plug-in
	Gradle 	[1.11]
	Maven 	[3.2.1]
	Android Developer Tool
	Software del vendor del modello su cui si vuole installare l'applicazione Android.

Copiare la cartella SUPPORT sul Desktop.
Importare i 3 progetti org.project.droolsDSL... all'interno del proprio workspace Eclipse.
Launch Runtime Eclipse.
Creare nuovo progetto Java:
	all'interno della cartella 'src' creare un nuovo file *.ddsl e scriverci statement in EC-DSL.
	salvare la definizione del problema scritta nel DSL. verificare nella cartella generata automaticamente ('MedicalEC\src') se l'activity principale presenta errori sui parametri. in caso positivo, modificare e salvare di nuovo il file .ddsl.
Premere il pulsante 'Compile Application' per aggiungere le librerie mancanti.
Collegare il dispositivo Android al PC.
Premere il pulsante 'Deploy Application' per installare l'applicazione sul dispositivo. 
Attendere lo spoiler di operazione riuscita:
	se ci dovessero essere problemi ripetere il deploy.