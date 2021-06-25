Feature: Compose Mail To Incubytes

Scenario: Signin Page
Given : user Launch The Application
When : user Enter The Valid Mailid In The Email Id Text Box
Then : user Click On The Next Button  And It Navigate To The Password Page

Scenario: Password Page
When : user Enter The Valid Password Id In The Password Text Box
Then : user Click On The Next Button  And It Navigate To The User Mail Inbox  Page

Scenario: Message Compose
When : user Click On The Compose Button And Compose Dialog Box Appears
And : user Enter The Recipient Mail Id In The To Text Box
And : user Enter The Subject Of The Mail In The Subject Field
And : user Compose The Body Of The Mail In The Mail Body Field
Then : user Click On The Send Button And It Sent The Mail.