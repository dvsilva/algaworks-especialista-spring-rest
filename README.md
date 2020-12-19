# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 07-11-reparando-migracoes-com-erros
git add .
git commit -m "Reparando migrações com erros"
git push origin 07-11-reparando-migracoes-com-erros

git checkout master
git merge --no-ff 07-11-reparando-migracoes-com-erros
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