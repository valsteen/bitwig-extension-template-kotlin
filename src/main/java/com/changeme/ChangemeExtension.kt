package com.changeme

import com.bitwig.extension.controller.ControllerExtension
import com.bitwig.extension.controller.api.ControllerHost

class ChangemeExtension(private val definition: ChangemeExtensionDefinition, host: ControllerHost) : ControllerExtension(definition, host) {
    override fun init() {
        // TODO: Perform your driver initialization here.
        // For now just show a popup notification for verification that it is running.
        host.showPopupNotification("Changeme Initialized")
    }

    override fun exit() {
        // TODO: Perform any cleanup once the driver exits
        // For now just show a popup notification for verification that it is no longer running.
        host.showPopupNotification("Changeme Exited")
    }

    override fun flush() {
        // TODO Send any updates you need here.
    }
}