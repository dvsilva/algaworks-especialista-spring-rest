# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 04-22-status-http-para-collection-resource-vazia
git add .
git commit -m "Status HTTP para collection resource vazia: qual usar?"
git push origin 04-22-status-http-para-collection-resource-vazia

git checkout master
git merge --no-ff 04-22-status-http-para-collection-resource-vazia
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