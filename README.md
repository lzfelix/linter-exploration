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

## Linter

This repository uses `scalafmt`, which can be easily configured to lint files on save on IntelliJ and VSCode.
