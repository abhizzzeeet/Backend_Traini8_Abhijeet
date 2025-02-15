# Traini8 Backend - Spring Boot

## Prerequisites

### Install Docker Desktop

- **For Windows:** [Install Guide](https://docs.docker.com/desktop/setup/install/windows-install/)
- **For Mac:** [Install Guide](https://docs.docker.com/desktop/setup/install/mac-install/)

If you face any issues, refer to this video: [YouTube Link](https://www.youtube.com/watch?v=ZyBBv1JmnWQ)

### Install Git

Download from: [Git SCM](https://git-scm.com/downloads)

## Setup & Run

### Step 1: Open Docker Desktop on your local system.

### Step 2: Clone the repository

Run the following command inside an empty directory:

```bash
git clone -b main https://github.com/abhizzzeeet/Backend_Traini8_Abhijeet.git
```

**OR**

Download the ZIP file from GitHub: [Repository Link](https://github.com/abhizzzeeet/Backend_Traini8_Abhijeet)  
Then, extract it into an empty directory.

### Step 3: Navigate to the project folder

```bash
cd traini8
```

### Step 4: Build and run the container

```bash
docker-compose up -d --build
```

This will pull dependencies, build the Docker image, and start the application.

### Step 5: Stop the application

To stop the running containers, use:

```bash
docker-compose down
