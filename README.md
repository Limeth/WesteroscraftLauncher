Westeroscraft Launcher
===================
Westeroscraft Launcher is the custom launcher for installing and updating Westeroscraft with built-in byte patching for easy upgrading/downgrading of Minecraft versions.

## What is Westeroscraft?
Westeroscraft is a modified version of the Minecraft client, which you can access through the the Westeroscraft Launcher, and when connecting to a server with SpoutPlugin, it allows you to unlock most of the features of SpoutPlugin, such as custom blocks, items, texture packs, etc. It also gives several speed improvements, a minimap, an overview map, etc.

[![Westeroscraft][Logo]][Homepage]  
[Homepage] | [Forums] | [Twitter]

## The License
Westeroscraft Launcher is licensed under the [GNU Lesser General Public License Version 3][License], but with a provision that files are released under the MIT license 180 days after they are published. Please see the `LICENSE.txt` file for details.

Copyright (c) 2011-2012, Spout LLC <<http://www.spout.org/>>

## Brand
This launcher is re-branded from its original form. Many thanks to the spout team for an excellent launcher and open licensing.

## Getting the Source
The latest and greatest source can be found here on [GitHub][Source].

## Compiling the Source
Westeroscraft Launcher uses Maven to handle its dependencies.

* Install [Maven 2 or 3](http://maven.apache.org/download.html)
* Checkout this repo and run: `mvn clean package`
* To compile an `exe` on a non-Windows platform, add: `-P package-win` to the previous goals.

## Contributing to the Project
Track and submit issues and bugs on our [issue tracker][Issues].  

## Code and Pull Request Formatting
* Generally follow the Oracle coding standards.
* No spaces, only tabs for indentation.
* No trailing whitespaces on new lines.
* 200 column limit for readability.
* Pull requests must compile, work, and be formatted properly.
* Sign-off on ALL your commits - this indicates you agree to the terms of our license.
* No merges should be included in pull requests unless the pull request's purpose is a merge.
* Number of commits in a pull request should be kept to *one commit* and all additional commits must be *squashed*.
* You may have more than one commit in a pull request if the commits are separate changes, otherwise squash them.
* For clarification, see the full pull request guidelines [here](http://spout.in/prguide).

**Please follow the above conventions if you want your pull request(s) accepted.**

[Logo]: http://files.enjin.com/403550/westeroscraftbanner.png
[Homepage]: http://westeroscraft.com
[Forums]: http://www.westeroscraft.com/forum
[License]: http://cdn.spout.org/license/spoutv1.txt
[Source]: https://github.com/GameOfBlocks/WesteroscraftLauncher
[Issues]: http://github.com/GameOfBlocks/WesteroscraftLauncher/issues
[Twitter]: http://twitter.com/WesterosCraft