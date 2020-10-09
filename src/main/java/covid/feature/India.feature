@india
Feature: Validate India page

@smoke
Scenario: Validate India link
Given Click India link
When get the confirmed case count
And get the active case count
And get the recovered case count
Then get the deceased case count

