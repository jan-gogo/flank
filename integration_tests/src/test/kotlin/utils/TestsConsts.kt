package utils

const val defaultAndroidOutputPattern = "AndroidArgs\\s*" +
    "gcloud:[\\s\\S]*" +
    "flank:[\\s\\S]*" +
    "RunTests[\\s\\S]*" +
    "Matrices webLink[\\s\\S]*" +
    "matrix-[\\s\\S]*" +
    "CostReport[\\s\\S]*" +
    "MatrixResultsReport[\\s\\S]*" +
    "1 test cases passed, 1 skipped[\\s\\S]*" +
    "Uploading JUnitReport.xml[\\s\\S]*" +
    "FetchArtifacts[\\s\\S]*" +
    "Updating matrix file"

const val defaultIosOutputPattern = "IosArgs.*?" +
    "gcloud:.*?" +
    "flank:.*?" +
    "RunTests.*?" +
    "Matrices webLink.*?" +
    "matrix-.*?" +
    "FetchArtifacts.*?" +
    "Updating matrix file.*?" +
    "CostReport.*?" +
    "MatrixResultsReport.*?" +
    "test cases passed.*?" +
    "Uploading JUnitReport.xml ."
