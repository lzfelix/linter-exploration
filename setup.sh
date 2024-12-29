#!/bin/bash

echo "Configuring Git hooks..."

# Set the custom hooks directory
git config core.hooksPath .githooks

# Make sure the pre-commit hook is executable
chmod +x .githooks/pre-commit

echo "Git hooks configured successfully!"
