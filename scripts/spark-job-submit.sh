#!/usr/bin/env bash
spark-submit --class com.barclays.fraud.feature.schedule.MainApp --master local target/fraud-feature-java-schedule-1.0-SNAPSHOT.jar