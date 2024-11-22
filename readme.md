### Compile

To generate `main.js` for local dev, use the following command:
```shell
sbt fastOptJS
```
The `main.js` file will be generated under `target/web/main.js`.

To generate `main.js` for production environment, use the following command:
```shell
sbt fullOptJS
```
The `main.js` file will be generated under `docs/main.js`, along with `index.html`. This `docs` folder will be used for 
setting the Github Pages.

### Github Pages

This is how to set Github Pages:

1- Go to your repository on GitHub.

2- Navigate to Settings > Pages.

3- Under Source, select Deploy from branch.

4- Choose the main branch and set the folder to /docs.

![image](https://github.com/ghazi-naceur/template-github-pages/blob/master/src/main/resources/github-pages-setting.png?raw=true)