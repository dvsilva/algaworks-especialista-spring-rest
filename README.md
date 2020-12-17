# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 06-03-analisando-impacto-do-relacionamento-muitos-para-muitos-na-rest-api
git add .
git commit -m "Analisando o impacto do relacionamento muitos-para-muitos na REST API"
git push origin 06-03-analisando-impacto-do-relacionamento-muitos-para-muitos-na-rest-api

git checkout master
git merge --no-ff 06-03-analisando-impacto-do-relacionamento-muitos-para-muitos-na-rest-api
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