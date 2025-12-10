SIMULATORE CALCIO

SPIEGAZIONE PROBLEMA

Il problema richiede la creazione di un progetto che comprende delle squadre di calcio che competeranno tra loro in una partita, queste squadre di calcio avranno dei giocatori con ruoli diversi che erediteranno dalla classe giocatore e ci saranno degli infortuni casuali fino alla conclusione del match.


 SVOLGIMENTO DEL PROBLEMA

Per svolgere il problema noi abbiamo cominciato implementando la classe padre da dove tutte le altre classi prenderanno metodi e attributi quindi la classe giocatore, abbiamo inserito dei metodi e degli attributi che ritenevamo comuni con le altre sottoclassi e una volta fatta essa abbiamo creato appunto le sottoclassi con tutti i ruoli dei giocatori come attaccante, difensore, ecc… una volta create queste classi abbiamo creato la partita ed il suo svolgimento, nella partita si controllerà secondo un procedimento casuale legato alle probabilità e la potenza dei giocatori la possibilità di subire e fare dei gol e quella di ottenere degli infortuni, se il giocatore viene infortunato perde potenza riducendo la sua utilità in campo, la partita dura 90 minuti e durante lo svolgimento in una arco di 15 secondi viene mandato in output il risultato della partita dove si vede: lo stadio e le squadre che giocano, chi e quando ha fatto gol, quanti gol sono stati fatti da entrambe le squadre e chi e quando si è infortunato,
abbiamo implementato anche il fattore del vantaggio quando si gioca in casa perché la squadra che gioca in casa ha il 15% in più di potenza rispetto alla squadra avversaria in modo da poter dare un vantaggio anche alla squadre un po’ meno forti.

SPIEGAZIONE INTERFACCIA

L’interfaccia è composta da un semplice command prompt dove le uniche cose che l’utente deve inserire sono:
1) Quale squadra gioca in casa.
2) Quale squadra gioca in trasferta.
3) Quali sono le squadre che giocheranno
Una volta fatto ciò il programma darà in output l’intera partita come descritta precedentemente.
