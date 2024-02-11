# Stock Market App

This repository contains the source code and configurations for the Stock Market App.

## Project Structure

- `app/`: Application code and Dockerfile.
- `cloud_run/`: Cloud Run configuration.
- `cloud_sql/`: SQL schema creation script.
- `load_balancer/`: Load Balancer configuration.
- `cloud_scheduler/`: Cloud Scheduler configuration.
- `monitoring_logging/`: Stackdriver alerts configuration.
- `security/`: VPC Service Controls and IAP configuration.
- `cloud_storage/`: Cloud Storage lifecycle policy.

## Build and Deployment

- Use Cloud Build (`cloud_run/cloudbuild.yaml`) for building and pushing Docker images to Container Registry.
- Deploy the app using Cloud Run, configure SQL using `cloud_sql/create_schema.sql`, set up Load Balancer, and schedule updates using Cloud Scheduler.

## Security

Implement security configurations as per the files in the `security/` directory.

## Documentation

Refer to individual configuration files for detailed information.

