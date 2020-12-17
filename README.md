# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 06-05-testando-e-analisando-impacto-da-incorporacao-de-classe-na-rest-api
git add .
git commit -m "Testando e analisando o impacto da incorporação de classe na REST API"
git push origin 06-05-testando-e-analisando-impacto-da-incorporacao-de-classe-na-rest-api

git checkout master
git merge --no-ff 06-05-testando-e-analisando-impacto-da-incorporacao-de-classe-na-rest-api
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