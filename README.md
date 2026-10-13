# ShopFlow

ShopFlow est une application marketplace B2C composée de deux parties :

- **Backend Spring Boot** (`shopflow`) : API REST en Java 17 avec Spring Boot, Spring Data JPA, Spring Security et H2 / PostgreSQL.
- **Frontend Angular** (`shopflow-frontend`) : interface utilisateur Angular 17 avec SSR support et connexion au backend via API.

## Structure du dépôt

- `shopflow/` : code source backend Java
- `shopflow-frontend/` : code source frontend Angular

## Prérequis

- Java 17
- Apache Maven
- Node.js et npm

## Lancer le backend

1. Ouvrir un terminal dans `shopflow`
2. Exécuter :

```bash
mvn clean package
```

3. Lancer l’application :

```bash
java -jar target/shopflow-1.0.0.jar
```

ou directement :

```bash
mvn spring-boot:run
```

Le backend écoute par défaut sur `http://localhost:8081`.

## Lancer le frontend

1. Ouvrir un terminal dans `shopflow-frontend`
2. Installer les dépendances :

```bash
npm install
```

3. Démarrer le frontend :

```bash
npm start
```

Puis ouvrir :

```text
http://localhost:4200
```

## Configuration API

Le frontend utilise l’URL du backend configurée dans :

- `shopflow-frontend/src/environments/environment.ts`
- `shopflow-frontend/src/environments/environment.prod.ts`

Actuellement, l’API cible :

```ts
apiUrl: 'http://localhost:8081/api'
```

Assure-toi que le backend est démarré avant d’utiliser le frontend.

## Notes pour GitHub

- Ce dépôt peut être hébergé directement sur GitHub en ajoutant un `README.md` à la racine.
- Le backend ne peut pas être exécuté depuis GitHub Pages, mais le code source peut être versionné et partagé.
- Pour une démo en ligne, déployer le backend sur un service cloud (Heroku, Railway, Azure, etc.) et le frontend sur un hébergeur statique ou une instance web.

## Bonnes pratiques

- Ajoute un `.gitignore` à la racine pour exclure `node_modules`, `target`, `.angular`, `dist`, etc.
- Valide que le frontend et le backend démarrent indépendamment avant de pousser sur GitHub.
