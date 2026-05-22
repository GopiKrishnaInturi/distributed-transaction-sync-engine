# Distributed Transaction Synchronization Engine

Distributed financial transaction synchronization platform built using Java, Spring Boot, PostgreSQL, Docker, and AWS deployment architecture.

## Features

- Distributed transaction replication
- Concurrent synchronization workflows
- Retry-based recovery handling
- Multi-node replication engine
- Transaction consistency validation
- SQL optimization
- Dockerized deployment
- Replication monitoring

## Run

```bash
docker-compose up --build
```

## APIs

- POST /transactions
- POST /replication/start
- GET /replication/status
- GET /health