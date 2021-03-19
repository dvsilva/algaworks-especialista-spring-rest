# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 20-16-gerando-documentacao-das-versoes-da-api-com-springfox-e-swaggerui
git add .
git commit -m "Gerando documentação das versões da API com SpringFox e Swagger UI"
git push origin 20-16-gerando-documentacao-das-versoes-da-api-com-springfox-e-swaggerui

git checkout master
git merge --no-ff 20-16-gerando-documentacao-das-versoes-da-api-com-springfox-e-swaggerui
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```