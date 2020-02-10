import ftl.Main
import picocli.CommandLine
import kotlin.system.exitProcess

fun main() {
    // GoogleApiLogger.logAllToStdout()

    // for debugging. Run test from IntelliJ IDEA
    val exitCode = CommandLine(Main()).execute("firebase", "test", "android", "run", "--dry")
    exitProcess(exitCode)
}
