package ftl.cli.firebase.test.android.configuration

import ftl.android.AndroidCatalog
import ftl.args.AndroidArgs
import ftl.config.FtlConstants
import ftl.log.logLn
import picocli.CommandLine
import java.nio.file.Paths

@CommandLine.Command(
    name = "list",
    headerHeading = "",
    synopsisHeading = "%n",
    descriptionHeading = "%n@|bold,underline Description:|@%n%n",
    parameterListHeading = "%n@|bold,underline Parameters:|@%n",
    optionListHeading = "%n@|bold,underline Options:|@%n",
    header = ["Print current list of locales available to test against"],
    description = ["Print current list of Android locales available to test against"],
    usageHelpAutoWidth = true
)
class AndroidLocalesListCommand : Runnable {
    override fun run() {
        logLn(AndroidCatalog.localesAsTable(projectId = AndroidArgs.loadOrDefault(Paths.get(configPath)).project))
    }

    @CommandLine.Option(names = ["-c", "--config"], description = ["YAML config file path"])
    var configPath: String = FtlConstants.defaultAndroidConfig

    @CommandLine.Option(names = ["-h", "--help"], usageHelp = true, description = ["Prints this help message"])
    var usageHelpRequested: Boolean = false
}
