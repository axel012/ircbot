# IrcBot

IrcBot is a twitch chat bot plugin for minecraft bukkit/spigot servers.

  - Displays Twitch chat on minecraft
  - Can execute minecraft command from twitch chat

# Minecraft Commands

  - /start or /ircbot:start - Starts Twitch Bot
  - /stop or /ircbot:stop - Stop Twitch Bot
  - /togglechat - Enable/Disable Twitch chat in game

# Twitch Commands
- !give <item_name>: gives an item to all players playing in the server.
- !items: link to item names
- !summon <entity>: Not implemented yet

# Config.yml
When running the plugin for the first time, this config file will be generated, in plugins/Ircbot/config.yml
Follow the instructions below to configure your Config file.
```yaml
# Enable/Disable twitch chat in minecraft chat
# Timeout is the time between a user message in milliseconds (to prevent spam)
chat:
  enable: true
  timeout: 15000
  
# channel: channel to connect to
# username: twitch credentials username
# oauth_pwd: oauth string generated from https://twitchapps.com/tmi/,
twitch:
  channel: ''
  username: ''
  oauth_pwd:''
# Commands enabled by the bot to execute by people of chat
#   example
#   !give <item_name> -> performs /give @a <item_name> command in minecraft
#   (nbt tags and item count are forbidden)
#   !summon <entity_name> -> performs /summon <entity_name> (not implemented)
# Params
#   @enable:  enable / disable command
#   @timeout: set timeout of a user sending the command in chat
#   @shared:  timeout is shared between users, when a user sends the command timeouts start couting
# @vote: (not implemented) allow voting for items between timeouts, 
ignore shared property if true
commands:
  give:
    enable: true
    timeout: 5000
    shared: false
    vote: false
  summon:
    enable: false
    timeout: 60000
    shared: true
    vote: false
```

### ScreenShoots
/start
![](/screenshot/screen1.png?raw=true)

Twitch command !give
![](/screenshot/screen2.png?raw=true)

/stop
![](/screenshot/screen3.png?raw=true)
You can still receive commands, but chat won't be shown.

### Build
- Clone repository
- Open in intellij or eclipse, run gradle build task

### Thanks 
    Thanks to Paul Mutton for its Twitch library 
    http://www.jibble.org/pircbot.php

### Todos
 - Add more commands
 - Implement Vote
 - Create better Readme