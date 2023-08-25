# Todo List API (Open for everyone)
A Springboot Todo List API

## Description
This is a todo list api with CRUD methods to manage a list of todo.
The idea of the project is to help developers learning to consume endpoints (i.e perform CRUD operations) or communicate with external endpoint to use it a an open api to learn and test stuff. 

## Tech behind
This is a **Springboot Application** that uses CRUD operations. It stores data on a **MySql Database**. 

## API Reference

### Get all todo list items: `/api/v1/todo`
Method: `POST`

#### Sample request body
```JSON
  {
    "id": 1,
    "title": "Title",
    "description": "Description",
    "dateTime": "2023-10-31T05:00"
  }
```
Status: `201`

### Get all todo list items: `/api/v1/todo`
Method: `GET`

#### Sample response body
```JSON
[
  {
    "id": 1,
    "title": "Title",
    "description": "Description",
    "dateTime": "2023-10-31T05:00"
  }
]
```
Status: `200`

### Get todo item by id: `/api/v1/todo/{id}`
Method: `GET`

#### Sample request URL `/api/v1/todo/1

#### Sample response body
```JSON
  {
    "id": 1,
    "title": "Title",
    "description": "Description",
    "dateTime": "2023-10-31T05:00"
  }
```

Http Status:`200`

### Update todo item by id: `/api/v1/todo/{id}`
Method: `DELETE`

#### Sample request Endpoint URL `/api/v1/todo/1

Status: `200`

#### Sample request body
```JSON
  {
    "id": 1,
    "title": "Title",
    "description": "Description",
    "dateTime": "2023-10-31T05:00"
  }
```

Http Status: `200`


## Author
### Peshel Gomo

Made in ZWE





