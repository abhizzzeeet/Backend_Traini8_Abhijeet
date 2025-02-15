# Traini8 Backend - Spring Boot

## Prerequisites

### Install Docker Desktop

- **For Windows:** [Install Guide](https://docs.docker.com/desktop/setup/install/windows-install/)
- **For Mac:** [Install Guide](https://docs.docker.com/desktop/setup/install/mac-install/)

If you face any issues, refer to this video: [YouTube Link](https://www.youtube.com/watch?v=ZyBBv1JmnWQ)

### Install Git

Download from: [Git SCM](https://git-scm.com/downloads)

## Setup & Run

### Step 1: Open Docker Desktop on your local system and let it run on background or just minimize it.

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

If the image is not built, run:

```bash
$env:PORT="9090"; docker-compose up -d --build
```

This will pull dependencies, build the Docker image, and start the application at PORT 9090 or PORT you provided in url.

If the image is already built, simply run the container:

```bash
docker-compose up -d
```

### Step 5: Stop the application

To stop the running containers, use:

```bash
docker-compose down


##Project Overview

###Contains 3 APIs

###1. POST request to add a training center to the database:

Request Type: POST

Request URL: http://localhost:<PORT>/api/training-centers

Request Body (JSON):

{
  "centerName": "Abhijeet Training",
  "centerCode": "WB5658UB87",
  "address": {
    "street": "123 MG Road",
    "city": "Bangalore",
    "state": "Karnataka",
    "pincode": "560001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Spring Boot", "MongoDB"],
  "contactEmail": "abhijeetbasfore@gmail.com",
  "contactPhone": "8972284977"
}

Output: Returns the added data (a training center object) in JSON response. Example output:

{
  "centerName": "Abhijeet Training",
  "centerCode": "WB5658UB87",
  "address": {
    "street": "123 MG Road",
    "city": "Bangalore",
    "state": "Karnataka",
    "pincode": "560001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Spring Boot", "MongoDB"],
  "contactEmail": "abhijeetbasfore@gmail.com",
  "contactPhone": "8972284977"
}

###2. GET request to fetch all training centers data from the database:

Request Type: GET

Request URL: http://localhost:<PORT>/api/training-centers

Output: list of training center objects in json response as in 1st point

3. GET request to filter training center data whose any field's value matches the query passed:

Request Type: GET

Request URL: http://localhost:<PORT>/api/training-centers/search?query=<search_text>

Output: list of training center objects in json response as in 1st point