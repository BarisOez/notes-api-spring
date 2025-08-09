# 📒 Notes API (Spring Boot)

Simple CRUD API for notes, using Spring Boot and H2 in-memory database.  
Einfache CRUD-API für Notizen, mit Spring Boot und H2-In-Memory-Datenbank.

## 🔗 Endpoints

| Method | Endpoint            | Description / Beschreibung |
|--------|---------------------|----------------------------|
| GET    | /api/notes          | Get all notes / Alle Notizen abrufen |
| GET    | /api/notes/{id}     | Get note by ID / Notiz nach ID abrufen |
| POST   | /api/notes          | Create a new note / Neue Notiz anlegen |
| PUT    | /api/notes/{id}     | Update a note / Notiz aktualisieren |
| DELETE | /api/notes/{id}     | Delete a note / Notiz löschen |

## ▶️ Run locally

```bash
mvn spring-boot:run
