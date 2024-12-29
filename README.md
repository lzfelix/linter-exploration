# TODO List

_It turns out the main purpose for this repo is not implementing a todo list, but rather fiddle with linting, CI pipelines, and git hooks_.

## Setup

Before starting to contribute, run `./setup.sh`. This will **change** the default git hooks for this repository to check for linting before running a commit.

If you are in a hurry or if you know the code is already properly linted, it's possible to bypass the hook with:

```bash
git commit --no-verify -m "Your commit message"
```

Remember the first step on the CI is linting, so it will ensure no broken code can be merged.

## Linter

This repository uses `scalafmt`, which can be easily configured to lint files on save on IntelliJ and VSCode.
