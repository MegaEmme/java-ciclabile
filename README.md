# Esercizio - Pista Ciclabile

Vogliamo realizzare una classe che contenga un elenco di interi e che ci permetta di ciclarli (dal primo all’ultimo).

Dovrà offrire due metodi :
- int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato. Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
- boolean hasAncoraElementi() (che deve restituire true se ci sono ancora elementi da restituire)

La classe deve avere un costruttore che prende come parametro un array di interi (che sarà l’elenco che viene gestito internamente)

Internamente alla classe vogliamo mantenere l’elenco di interi come array, no ArrayList o simili.

## *Bonus:*
prevedere anche un costruttore che non prenda parametri e un metodo addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.

### Nota bene:
Vanno utilizzati solo gli array nativi e quindi non è possibile usare iterator vari.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
