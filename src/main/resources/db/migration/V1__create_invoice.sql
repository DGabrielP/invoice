CREATE TABLE IF NOT EXISTS client (
    id SERIAL,
    full_name VARCHAR(255) NOT NULL,
    age INT,
    address VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
    );

CREATE TABLE IF NOT EXISTS invoice (
    id SERIAL,
    code VARCHAR(255) NOT NULL,
    create_at DATE NOT NULL,
    total DECIMAL(10,2) NOT NULL,
    client_id INTEGER NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (client_id) REFERENCES client(id)
    );



