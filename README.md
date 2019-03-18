### RESTful Web Services

User -> Posts (One to many)

- Retrieve all users: `GET /users`
- Create a user: `POST /users`
- Retrieve one user: `GET /users/{id} -> /users/1`
- Delete a user: `DELETE /users/{id} -> /users/1`


- Retrieve all posts for a User: - `GET /users/{id}/posts`
- Create a post for a User: - `POST /users/{id}/posts/`
- Retrieve details of a post: - `GET /users/{id}/posts/{post_id}` 