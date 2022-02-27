# udpclient
This repository contains a MyUdpClient.java program 
The Client prompts the user to type a sentence.
The Client sends the sentence to a UDP server application on the Chapman ICD server which returns a capitalized version of the sentence

* it continues to prompt the user to type sentences and get responses from the server until the user types "Goodbye" instead of just exiting after it receives the first response.
* it closes the socket and exits after it receives the "GOODBYE" response from the server and prints it on the screen
* it runs properly with the provided udp.input test file. (i.e. "java MyUdpClient  < udp.input" runs properly and produces correct output)

## Identifying Information

* Name: Tyler Lewis
* Student ID: 2366930
* Email: tylewis@chapman.edu
* Course: 353, Computer Networks
* Assignment: UDP Client

