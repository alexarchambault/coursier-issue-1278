With the [coursier-based sbt launcher](https://github.com/coursier/sbt-extras/blob/e20d91edd7c2e9f4a17629dfae7d7d6bf9ba72a0/sbt):
```
$ sbt update # uses sbt-lm-coursier by default
…
[info] Updating ...
[info] Updating
[info] Resolved  dependencies
[error] lmcoursier.internal.shaded.coursier.error.ResolutionError$Several: Error downloading org.webjars.npm:browserslist:[2.5.1,3)
[error]   Not found
[error]   not found: /Users/alexandre/.ivy2/local/org.webjars.npm/browserslist
[error]   not found: https://repo1.maven.org/maven2/org/webjars/npm/browserslist/2.11.3/browserslist-2.11.3.pom
[error]   not found: https://repo.typesafe.com/typesafe/ivy-releases/org.webjars.npm/browserslist/
[error]   not found: https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/org.webjars.npm/browserslist/
[error] Conflicting dependencies:
[error] org.webjars.npm:is-number:[2.1.0,3):default(compile)
[error] org.webjars.npm:is-number:[4.0.0,5):default(compile)
[error] org.webjars.npm:kind-of:[3.0.2,4):default(compile)
[error] org.webjars.npm:kind-of:[6.0.0,7):default(compile)
[error] org.webjars.npm:string-width:[1.0.1,2):default(compile)
[error] org.webjars.npm:string-width:[2.0.0,3):default(compile)
[error] org.webjars.npm:strip-ansi:[3.0.1,4):default(compile)
[error] org.webjars.npm:strip-ansi:[4.0.0,5):default(compile)
[error] 	at lmcoursier.internal.shaded.coursier.error.ResolutionError$.from(ResolutionError.scala:71)
[error] 	at lmcoursier.internal.shaded.coursier.Resolve.validate0$1(Resolve.scala:142)
[error] 	at lmcoursier.internal.shaded.coursier.Resolve.$anonfun$ioWithConflicts0$4(Resolve.scala:184)
[error] 	at lmcoursier.internal.shaded.coursier.util.Task$.$anonfun$flatMap$2(Task.scala:14)
[error] 	at scala.concurrent.Future.$anonfun$flatMap$1(Future.scala:307)
[error] 	at scala.concurrent.impl.Promise.$anonfun$transformWith$1(Promise.scala:41)
[error] 	at scala.concurrent.impl.CallbackRunnable.run(Promise.scala:64)
[error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
[error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
[error] 	at java.lang.Thread.run(Thread.java:745)
[error] (update) lmcoursier.internal.shaded.coursier.error.ResolutionError$Several: Error downloading org.webjars.npm:browserslist:[2.5.1,3)
[error]   Not found
[error]   not found: /Users/alexandre/.ivy2/local/org.webjars.npm/browserslist
[error]   not found: https://repo1.maven.org/maven2/org/webjars/npm/browserslist/2.11.3/browserslist-2.11.3.pom
[error]   not found: https://repo.typesafe.com/typesafe/ivy-releases/org.webjars.npm/browserslist/
[error]   not found: https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/org.webjars.npm/browserslist/
[error] Conflicting dependencies:
[error] org.webjars.npm:is-number:[2.1.0,3):default(compile)
[error] org.webjars.npm:is-number:[4.0.0,5):default(compile)
[error] org.webjars.npm:kind-of:[3.0.2,4):default(compile)
[error] org.webjars.npm:kind-of:[6.0.0,7):default(compile)
[error] org.webjars.npm:string-width:[1.0.1,2):default(compile)
[error] org.webjars.npm:string-width:[2.0.0,3):default(compile)
[error] org.webjars.npm:strip-ansi:[3.0.1,4):default(compile)
[error] org.webjars.npm:strip-ansi:[4.0.0,5):default(compile)
…
$ sbt -C--coursier-plugin=sbt-coursier update
…
[success] …
```
