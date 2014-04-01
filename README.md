# OpenShift Cookbook - Chapter 7 Recipe 4 Sample Application#

A simple Job portal written using Java EE 6 and PostgreSQL 9.2.

To run it on OpenShift, run the following command.

Create a new Twitter application by going to https://dev.twitter.com. Give the application both read and write rights.

```
$ rhc app-create jobstore jbosseap postgresql-9.2 --env TWITTER_CONSUMER_KEY=$TWITTER_CONSUMER_KEY TWITTER_CONSUMER_SECRET=$TWITTER_CONSUMER_SECRET TWITTER_ACCESS_TOKEN_KEY=$TWITTER_ACCESS_TOKEN_KEY TWITTER_ACCESS_TOKEN_SECRET=$TWITTER_ACCESS_TOKEN_SECRET --from-code https://github.com/OpenShift-Cookbook/chapter7-recipe4.git
```
