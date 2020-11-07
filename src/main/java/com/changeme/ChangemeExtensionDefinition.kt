package com.changeme

import com.bitwig.extension.api.PlatformType
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList
import com.bitwig.extension.controller.ControllerExtensionDefinition
import com.bitwig.extension.controller.api.ControllerHost
import java.util.*

class ChangemeExtensionDefinition : ControllerExtensionDefinition() {
    override fun getName(): String {
        return "Changeme"
    }

    override fun getAuthor(): String {
        return "Changeme"
    }

    override fun getVersion(): String {
        return "0.1"
    }

    override fun getId(): UUID {
        // TODO IMPORTANT change this by your own generated UUID !
        return UUID.fromString("bb70a7dc-a900-46ea-8b50-618974df35e1")
    }

    override fun getHardwareVendor(): String {
        return "Changeme"
    }

    override fun getHardwareModel(): String {
        return "Changeme"
    }

    override fun getRequiredAPIVersion(): Int {
        return 12
    }

    override fun getNumMidiInPorts(): Int {
        return 1
    }

    override fun getNumMidiOutPorts(): Int {
        return 1
    }

    override fun listAutoDetectionMidiPortNames(list: AutoDetectionMidiPortNamesList, platformType: PlatformType) {}
    override fun createInstance(host: ControllerHost): ChangemeExtension {
        return ChangemeExtension(this, host)
    }
}