# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 12-24-refatorando-o-codigo-de-regras-para-transicao-de-status-de-pedidos
git add .
git commit -m "Refatorando o código de regras para transição de status de pedidos"
git push origin 12-24-refatorando-o-codigo-de-regras-para-transicao-de-status-de-pedidos

git checkout master
git merge --no-ff 12-24-refatorando-o-codigo-de-regras-para-transicao-de-status-de-pedidos
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