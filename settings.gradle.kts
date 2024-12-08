rootProject.name = "streamio"

include("stream-adapter:http")
include("stream-adapter:persistence")

include("stream-app:api")
include("stream-app:batch")

include("stream-common")

include("stream-core:domain")
include("stream-core:port")
include("stream-core:service")
include("stream-core:usecase")
