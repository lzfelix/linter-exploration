# TODO List

_It turns out the main purpose for this repo is not implementing a todo list, but rather fiddle with linting, CI pipelines, and git hooks_.

## Setup

Before starting to contribute, run `./setup.sh`. This will **change** the default git hooks for this repository to check for linting before running a commit.
If no-linted scala files are found, an error message is shown, requiring the user to fix the issues before proceeding. We have chosen to not automatically lint the files to keep users with full control on the repository.
It's important to mention that only staged Scala files are checked.

If you are in a hurry or if you know the code is already properly linted, it's possible to bypass the hook with:

```bash
git commit --no-verify -m "Your commit message"
```

Remember the first step on the CI is linting, so it will ensure no broken code can be merged.

## Consequences

Trying to commit a non-linted file will produce the following output:

![Example of a commit with a failing hook](./imgs/cli-failing-hook.png)

### Pros
- Easy to configure
- Full flexibility and control
- As the hook scripts live in a version-controlled directory, eventual (rare) changes will be incorporated locally transparently.

### Cons
- May disrupt users workflow if they rely on git hooks
- Requires users to run `./setup.sh` right after cloning the repository

### Competing solutions

- [Pre-commit](https://pre-commit.com/):  A framework for managing and maintaining multi-language pre-commit hooks. Despite language-agnostic, it requires a Python installation to run.
- [Husky](https://github.com/typicode/husky): A JavaScript framework for managing git hooks.
- [sbt-git-hooks](https://github.com/AbsaOSS/sbt-git-hooks): Similar to Husky, it allows keeping git hooks as part of a SBT project. The downside is that it creates a dependency between git and sbt (which may be slow to start up in larger projects).

## Linter information

This repository uses `scalafmt`, which can be easily configured to lint files on save on IntelliJ and VSCode.
Global Scalafmt configurations (irrespective of IDE) can be set by modifying `.scalafmt.conf`.