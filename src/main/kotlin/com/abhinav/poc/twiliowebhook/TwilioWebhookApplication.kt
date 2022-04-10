package com.abhinav.poc.twiliowebhook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TwilioWebhookApplication

fun main(args: Array<String>) {
    runApplication<TwilioWebhookApplication>(*args)
}
