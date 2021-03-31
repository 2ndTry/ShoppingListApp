#!/usr/bin/env sh

heroku apps:create shopping-list-miroshnikov
heroku addons:create heroku-postgresql:hobby-dev --app shopping-list-miroshnikov