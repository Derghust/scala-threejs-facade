# Contribution

## Guide

### Fixing or implementing missing features from three.js

It is necessary to use specific release from three.js due to some incompatibilities.

1. Clone [ThreeJs](https://github.com/mrdoob/three.js)
```shell
git clone https://github.com/mrdoob/three.js.git
```
2. Checkout specific to specific release version
```
cd three.js
git checkout -b r165
```
3. Check from repository what you want to fix or implement in three.js facade

## Code of conduct

Format your code before submiting MR:

```shell
sbt scalafmtSbt
```
